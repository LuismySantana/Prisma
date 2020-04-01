package Prisma;

/**
 * Clase Prisma con base y altura
 * Contiene metodos para calcular el area de sus partes
 */
public class Prisma {
    private int baseTriangulo;
    private int alturaPrisma;

    public Prisma(int baseTriangulo, int alturaPrisma) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
    }

    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public int getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    public float alturaTriangulo () {
        return (((float) Math.sqrt(3))/2)*baseTriangulo;
    }

    public float areaBase () {
        return (baseTriangulo*alturaTriangulo())/2;
    }

    public float perimetro () {
        return 3*baseTriangulo;
    }

    public float areaLateral () {
        return perimetro()*alturaPrisma;
    }

    public float areaTotal () {
        return 2*areaBase()+areaLateral();
    }
}
