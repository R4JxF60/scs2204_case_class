// case class Point
case class Point(a: Double, b: Double) {
    
    def x: Double = a
    def y: Double = b

    /*
        * add(+) method
        * @param that Point object
        * adding two points
        * @return Point object
    */
    def +(that: Point): Point = {
        Point(this.x+that.x, this.y+that.y)
    }

    /*
        * move method
        * @param dx Double delta x value
        * @param dy Double delta y value
        * moving the point
        * @return Point object
    */
    def move(dx: Double, dy: Double): Point = {
        Point(this.x+dx, this.y+dy)
    }

    /*
        * invert method
        * inverting x and y coordinates
        * @return Point object
    */
    def invert: Point = {
        Point(this.y, this.x)
    }
}

// companion object for the class Point
object Point {

    /*
        * distance method
        * @param p1 Point object
        * @param p2 Point object
        * calculating the distance
        * @return distance Double
    */
    def distance(p1: Point, p2: Point): Double = {
        scala.math.sqrt(scala.math.pow((p1.x-p2.x),2)+scala.math.pow((p1.y-p2.y),2))
    }


    // drive function main
    def main(args: Array[String]): Unit = {
        var p1 = Point(1.25, 3.75)      // point 1
        var p2 = Point(-8.47, 78.571)   // point 2

        println("\n                                point 1 : "+p1)
        println("                                point 2 : "+p2+"\n")

        println("              adding point 1 to point 2 : "+p1.+(p2)+"\n")
        println("         distance between point 1 and 2 : "+distance(p1, p2)+"\n")

        // move point 1
        println("after calling move(4.25, -3) on point 1 : "+p1.move(4.25, -3))

        // move point 2
        println("after calling move(0.125, 5) on point 2 : "+p2.move(0.125, 5)+"\n")

        // inverting point 1
        println("                after inverting point 1 : "+p1.invert)

        // inverting point 2
        println("                after inverting point 2 : "+p2.invert+"\n")
    }
}
