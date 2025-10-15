public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarPhfProfissional();
        System.out.println("--------------");
    }

    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
    }
    public static void mostrarPhfProfissional() {
        PhfProfissional phfProfissional = new PhfProfissional();
        System.out.println(phfProfissional.seuNome());
        System.out.println(phfProfissional.suaAreaAtuacao());
        System.out.println("Alteração de código...");
    }

}