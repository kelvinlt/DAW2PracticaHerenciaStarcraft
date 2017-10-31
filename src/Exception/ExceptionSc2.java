package Exception;

public class ExceptionSc2 extends Exception {
    private int code;
    public ExceptionSc2(int code) {
        super(); 
        this.code = code;
    }

    @Override
    public String getMessage() {
        switch(this.code){
            case 1: 
                return "< ERROR 001: Nº de argumentos inválido > ";
            case 2: 
                return "< ERROR 002: Especie incorrecta > ";              
            case 3:   
                return "< ERROR 003: Dato incorrecto >";
            case 4:
                return "< ERROR 004: Operación incorrecta >";
            case 5:
                return "< ERROR 005: No existe especie con ese nombre >";
            case 6:
                return "< ERROR 006: Propiedad incorrecta>";
            case 7:
                return "< ERROR 007: Ya existe un escuadrón con ese nombre >";
        }
        return null;
    } 
}
