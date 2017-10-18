package Decorator;

/**
 * Created by SG on 2017/10/18.
 */
public abstract class Decoratior extends View {

    View view;

    public void setView(View view) {
        this.view = view;
    }

    public abstract void showDecoration();

    @Override
    public void display() {

        System.out.print("显示");

        showDecoration();
        view.display();
    }
}
