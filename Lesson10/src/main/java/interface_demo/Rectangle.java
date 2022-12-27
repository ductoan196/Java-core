package interface_demo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Rectangle implements IShape{
    private double width;
    private double height;

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }
}
