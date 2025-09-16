package U4_act_3_reflection_genericos;

import lombok.ToString;

@ToString
public class Caja<T> {
    private T contenido;

    public void setContenido(T contenido){
        this.contenido = contenido;
    }

    public T getContenido(){
        return contenido;
    }

}
