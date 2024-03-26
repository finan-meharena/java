package C.Inheritance.F.ComparingObjects;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) { // constructor
        this.x = x;
        this.y = y;
    }

    @Override // override (use cmd + n then select 'override method')
    public boolean equals(Object obj) { // can't change Object to Point because that would change the method signature
        if (!(obj instanceof Point))  // return false if obj is not Point instance
            return false;

       var other = (Point) obj;
       return (other.x == x) && (other.y == y);
    }

    @Override  // override hashcode to return hashcode based on x and y values (it normally returns address hash result)
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
