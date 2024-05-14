package clase;

import java.util.ArrayList;

public class Operator {
  private  IOperatiune operatiune;

  public void introducereComanda(IOperatiune comanda){
      comanda.opereaza();
  }


}
