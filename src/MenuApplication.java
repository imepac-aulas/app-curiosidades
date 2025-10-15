import java.sql.SQLOutput;

public class MenuApplication {
    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarMjProfissional();
        System.out.println("--------------");
    }
    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
    }


    public static void mostrarMjProfissional() {
        MjProfissional mjProfissional = new MjProfissional();
        System.out.println(mjProfissional.seuNome());
        System.out.println(mjProfissional.suaAreaAtuacao());
    }
}