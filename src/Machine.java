public abstract class Machine {
    private boolean wasStarted;

    public void start(){
        wasStarted = true;

    }

    public void stop(){
        wasStarted = false;

    }

    public void drive(){
        System.out.println("I am driven by someone");
    }

    public abstract void  work();

}
