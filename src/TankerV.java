public class TankerV extends Vessel{
    @Override
    public void vessel(String fn, int d, int l, int w, int mc) {
        super.vessel(fn, d, l, w, mc);
        cargoType = "liquid";
    }
}
