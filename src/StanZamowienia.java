import javax.lang.model.type.ArrayType;

public enum StanZamowienia {
    ZLOZONE("ZLOZONE"),
    PRZYGOTOWANE_DO_WYSYLKI("PRZYGOTOWANE_DO_WYSYLKI"),
    W_TRANSPORCIE("W_TRANSPORCIE"),
    ZREALIZOWANE("ZREALIZOWANE"),
    ANULOWANE("ANULOWANE");


    private final String stanZamowienia;

    StanZamowienia(String stanZamowienia) {
        this.stanZamowienia = stanZamowienia;
    }

        }



