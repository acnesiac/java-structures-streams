package patterns.behavioral.state.improved;


public class OpenTCPConnectionState implements TCPConnectionState{

    private final TCPConnection connection;


    public OpenTCPConnectionState(TCPConnection connection) {
        this.connection = connection;
    }

    @Override
    public void open() {
        System.out.println("Reinitializing connection");
    }

    @Override
    public void close() {
        connection.setTcpConnectionState(new ClosedTCPConnectionState(connection));
        System.out.println("Closing connection");
    }

    @Override
    public void acknowledge() throws Exception {
        System.out.println("Acknowledge");
    }


}
