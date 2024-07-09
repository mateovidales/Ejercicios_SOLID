public interface Worker {
    void work();

    void eat();
}

interface Workeable {
    void work();
}

interface Eatable {
    void eat();
}

class RobotWorker implements Workeable {
    @Override
    public void work() {
    }

    class HumanWorker implements Workeable, Eatable {
        @Override
        public void work() {

        }

        @Override
        public void eat() {

        }
    }
}
