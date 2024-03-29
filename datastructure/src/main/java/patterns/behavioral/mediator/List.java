package patterns.behavioral.mediator;


import java.util.ArrayList;

public class List {

    private final java.util.List<String> items = new ArrayList<String>();


    private InputText inputText;


    public void selectItem(int itemNumber){
        String item = items.get(itemNumber);
        inputText.setValue(item);
    }


    public java.util.List<String> getItems() {
        return items;
    }

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }
}
