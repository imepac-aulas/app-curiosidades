public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões \n--------------");
        mostrarEhfProfissional();
        System.out.println("--------------");
        mostrarGhmProfissional();
    }

    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
    }

    public static void mostrarGhmProfissional() {
        GhmProfissional ghmProfissional = new GhmProfissional();
        System.out.println(ghmProfissional.seuNome());
        System.out.println(ghmProfissional.suaAreaAtuacao());
        System.out.println("--------------");
    }
}