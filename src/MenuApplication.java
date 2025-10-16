
public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarIgorProfissional();
        mostrarTmsProfissional();
        System.out.println("--------------");
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

        public static void mostrarIgorProfissional() {
            IgorProfissional igorProfissional = new IgorProfissional();
            System.out.println(igorProfissional.seuNome());
            System.out.println(igorProfissional.suaAreaAtuacao());

            System.out.println("Alterei seu arquivo...");


            System.out.println("Joãozin passou nesse branch papae hehe kk");
            System.out.println("Sua branch foi sorteada, xoxo Saminha.");

        }
}