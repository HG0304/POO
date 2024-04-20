package controler;

import model.Soma;
import view.Janela;

public class Controler {
    private Janela view;

    public Controler(Janela view) {
        this.view = view;
    }
    
    public void controlSoma(){
        double n1 = Double.parseDouble(view.getTxtNum1().getText());
        double n2 = Double.parseDouble(view.getTxtNum2().getText());
        
        Soma s = new Soma();
        
        view.getTxtResultado().setText(String.valueOf(s.calcular(n1, n2)));
    }
    
    public void controlLimpa(){
        view.getTxtNum1().setText("");
        view.getTxtNum2().setText("");
        view.getTxtResultado().setText("");
    }
}
