package main;

public class Coordenadas {
    private int coordenadaX, coordenadaY;

    public Coordenadas(int x, int y){
        this.coordenadaX = x;
        this.coordenadaY = y;
    }

    public int getX(){
        return coordenadaX;
    }
    
    public int getY(){
        return coordenadaY;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Coordenadas)) return false; //confirma se o é do tipo Coordenadas

        Coordenadas coordenadas = (Coordenadas) o;

        return coordenadaX == coordenadas.coordenadaX && coordenadaY == coordenadas.coordenadaY;
    }
}
