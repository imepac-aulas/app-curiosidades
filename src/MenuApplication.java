public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarEmsProfissional2();
        System.out.println("--------------");
    }

    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
    }
    public static void mostrarEmsProfissional2() {
        EmsProfissional emsProfissional = new EmsProfissional();
        System.out.println(emsProfissional.seuNome());
        System.out.println(emsProfissional.suaAreaAtuacao());
        System.out.println("Ajustei sua branch - everton");
    }
}