public class BoilerplateHelper {
    public Boilerplate apply(int x) {
	return new Boilerplate(x);
    }
    public Integer unapply(Boilerplate boilerplate) {
	return boilerplate.x();
    }
}
