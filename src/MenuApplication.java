public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarIgorProfissional();
        System.out.println("--------------");
    }

    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
    }

        public static void mostrarIgorProfissional() {
            IgorProfissional igorProfissional = new IgorProfissional();
            System.out.println(igorProfissional.seuNome());
            System.out.println(igorProfissional.suaAreaAtuacao());

            System.out.println("Joãozin passou nesse branch papae hehe kk");
            System.out.println("Sua branch foi sorteada, xoxo Saminha.");
        }
}