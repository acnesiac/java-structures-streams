package patterns.behavioral.memento.improved;


public class ConnectionSolverCaretaker {

    private ConnectionSolverMemento connectionSolverMemento;

    public void saveState(ConnectionSolver connectionSolver){
        connectionSolverMemento = connectionSolver.createMemento();
    }

    public void restoreState(ConnectionSolver connectionSolver){

        connectionSolver.setMemento(connectionSolverMemento);

    }


}
