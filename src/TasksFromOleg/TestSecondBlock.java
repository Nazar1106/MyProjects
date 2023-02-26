package TasksFromOleg;

class TestSecondBlock {

    void name() {
        System.out.println("Hello");
    }
}

class Test {


    TestSecondBlock t1 = new TestSecondBlock() {

        @Override
        void name() {
            System.out.println("Kick");
        }
    };

    public static void main(String[] args) {
        Test t2 = new Test();
        t2.t1.name();


    }
}