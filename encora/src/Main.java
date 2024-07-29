import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader("Dec 01 06 - Dec 05 12\nDec 08 00 - Dec 12 24\nDec 29 00 - Dec 30 24"));
        String str =null;
        int max = 0;
        int currentMax= 0;
        LocalDateTime currentLocale= null;
        DateTimeFormatter df =
                new DateTimeFormatterBuilder().appendPattern("MMM dd HH")
                        .parseDefaulting(ChronoField.YEAR, 2024)
                        .toFormatter();
        HashMap <LocalDateTime,LocalDateTime>hm =  new HashMap();

        while ( (str = br.readLine()) != null ){
            LocalDateTime parse1 = LocalDateTime.parse(str.substring(0,9),df);
            LocalDateTime parse = LocalDateTime.parse(str.substring(12,str.length()),df);
            hm.put(parse1,parse);
        }



        Comparator<Map.Entry<LocalDateTime,LocalDateTime>> valueComparator =
                (e1, e2) -> e1.getValue().compareTo(e2.getValue());

        Map<LocalDateTime,LocalDateTime> sortedMap =
                hm.entrySet().stream().
                        sorted(valueComparator).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));

        for(Map.Entry<LocalDateTime,LocalDateTime>entry : sortedMap.entrySet()){
            System.out.println(entry );

            if( currentLocale != null){
                Duration diffres = Duration.between(currentLocale, entry.getKey());
                System.out.println(currentLocale +"---"+ entry.getKey() + "---->" + diffres.toHours());
                int hours = (int) diffres.toHours();
                if ( hours > max ){
                    max = hours;
                }
            }
            currentLocale = entry.getValue();
        }
        System.out.println(max );
    }
}