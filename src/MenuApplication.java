public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarNsmProfissional();
        System.out.println("--------------");
    }

    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
        System.out.println();
    }


    public static void mostrarNsmProfissional() {
        NsmProfissional nsmProfissional = new NsmProfissional();
        System.out.println(nsmProfissional.seuNome());
        System.out.println(nsmProfissional.suaAreaAtuacao());
    }
}