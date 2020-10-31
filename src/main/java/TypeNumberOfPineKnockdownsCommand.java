import java.util.Arrays;
import java.util.List;

public class TypeNumberOfPineKnockdownsCommand {
    private String valor;

    public TypeNumberOfPineKnockdownsCommand(String valor) {
        CheckValidity(valor);
        this.valor = valor;
    }

    public static TypeNumberOfPineKnockdownsCommand FromValor(String valor) throws Exception {
       return new TypeNumberOfPineKnockdownsCommand(valor);
    }
    private static void CheckValidity(String valor) throws IllegalArgumentException{
        if (valor==null)
            throw new IllegalArgumentException("Valor nulo");
        if (valor.trim().length()==0)
            throw new IllegalArgumentException("Sin valor");
        List<String> possibleValues = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "F");
        if (possibleValues.indexOf(valor)<0)
            throw new IllegalArgumentException("Valor no soportado");

    }

    public String getValor() {
        return valor;
    }

    public int getQuantity() {
        if (valor.equals("F"))
            return 0;
        return Integer.parseInt(valor);
    }

}
