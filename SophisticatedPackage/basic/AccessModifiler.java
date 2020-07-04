package SophisticatedPackage.basic;

public class AccessModifiler {
    public static void main(String[] args) {

    }

    //widoczny w pozostałych klasach
    public void DoSomethingInPublic (){

    }

    //widoczny wyłącznie w tej klasie
    private void DoSomethingInPrivate (){

    }

    //widoczny w pakietach i subklasach
    protected void DoSomethingInProtected(){

    }

    //widoczny wyłącznie w pakietach
    void DoSomething (){

    }
}
