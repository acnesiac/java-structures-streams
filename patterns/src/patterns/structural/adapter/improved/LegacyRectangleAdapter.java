package structural.adapter.improved;

public class LegacyRectangleAdapter extends Rectangle{

    private final LegacyRectangle legacyRectangle;

    public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public Integer determineSize() {
        return legacyRectangle.calculateSize();
    }
}
