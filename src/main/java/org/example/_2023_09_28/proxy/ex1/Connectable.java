package org.example._2023_09_28.proxy.ex1;

public interface Connectable {
    void connect();

    void terminate();
}

class AccountController implements Connectable {

    @Override
    public void connect() {
        System.out.println("RealCar void connect()");
    }

    @Override
    public void terminate() {
        System.out.println("RealCar void terminate()");
    }
}

class ProxyAccountController implements Connectable {
    private Connectable connectable;

    public ProxyAccountController(Connectable connectable) {
        this.connectable = connectable;
    }

    @Override
    public void connect() {
        System.out.println("connect logging.......");
        connectable.connect();
    }

    @Override
    public void terminate() {
        System.out.println("terminate logging.......");
        connectable.terminate();
    }
}

class Main {
    public static void main(String[] args) {
        Connectable accountController = new AccountController();
        Connectable proxy = new ProxyAccountController(accountController);

        proxy.connect();
        proxy.terminate();
    }
}