
public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões \n--------------");
        mostrarEhfProfissional();
        mostrarTmsProfissional();
        System.out.println("--------------");
        mostrarGhmProfissional();
    }

    private static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
        System.out.println();
        System.out.println();
    }



    public static void mostrarTmsProfissional() {
        TmsProfissional tmsProfissional = new TmsProfissional();
        System.out.println(tmsProfissional.seuNome());
        System.out.println(tmsProfissional.suaAreaAtuacao());
        System.out.println("Alteração de código....");
    }

    public static void mostrarGhmProfissional() {
        GhmProfissional ghmProfissional = new GhmProfissional();
        System.out.println(ghmProfissional.seuNome());
        System.out.println(ghmProfissional.suaAreaAtuacao());
        System.out.println("--------------");
    }
}