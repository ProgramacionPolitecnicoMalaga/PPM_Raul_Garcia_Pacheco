public class ElementoTest {

    //private String nombre, apellido;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public  ElementoTest( int id)
    {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ElementoTest{" +
                "id=" + id +
                '}';
    }
}
