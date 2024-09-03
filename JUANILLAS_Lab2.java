// Base class
class Cylinder {
    double radius, height, area;

    // Method to calculate the area
    void area() {
        area = 2 * Math.PI * radius * (radius + height);
        System.out.printf("Cylinder Area: %.2f%n" , area);
    }
}

// Derived class
class CylinderVol extends Cylinder {
    double volume;

    // Method to calculate the volume
    void volume() {
        volume = Math.PI * radius * radius * height;
        System.out.printf("Cylinder Volume: %.2f%n ", volume);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of CylinderVol class
        CylinderVol cylinder = new CylinderVol();
        
        // Get user input for radius and height
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        cylinder.radius = scanner.nextDouble();
        System.out.print("Enter height of cylinder: ");
        cylinder.height = scanner.nextDouble();
        
        // Compute the area and volume
        cylinder.area(); // Call area method from Cylinder class
        cylinder.volume(); // Call volume method from CylinderVol class
    }
}
