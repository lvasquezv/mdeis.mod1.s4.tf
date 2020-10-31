import java.util.Arrays;
import java.util.List;

public class TypePlayerName {
    private String valor;

    public TypePlayerName(String valor) {
        this.valor = valor;
    }
    public static TypePlayerName FromValor(String valor) throws Exception {
        CheckValidity(valor);
        return new TypePlayerName(valor);
    }
    private static void CheckValidity(String valor) throws Exception {
        if (valor==null)
            throw new Exception("Valor nulo");
        if (valor.trim().length()==0)
            throw new Exception("Sin valor");
        if (valor.length()<20)
            throw new Exception("Valor no soportado");

    }

    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }

}
