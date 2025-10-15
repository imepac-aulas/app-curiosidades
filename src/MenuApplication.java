public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarFDProfissional();
        System.out.println("--------------");
    }

    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
    }

    public static void mostrarFDProfissional() {
        FDProfissional efFdProfissional = new FDProfissional();
        System.out.println(efFdProfissional.seuNome());
        System.out.println(efFdProfissional.suaAreaAtuacao());
    }
}