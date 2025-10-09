public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarGccProfissional();
                System.out.println("--------------");
    }

    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
        System.out.println();
    }
    public static void mostrarGccProfissional(){
        GccProfissional gccProfissional = new GccProfissional();
        System.out.println(gccProfissional.seuNome());
        System.out.println(gccProfissional.suaAreaAtuacao());
    }
}