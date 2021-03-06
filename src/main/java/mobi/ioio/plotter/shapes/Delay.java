package mobi.ioio.plotter.shapes;

import mobi.ioio.plotter.Curve;

public class Delay extends Curve {
	private final float pos_[];
	private final double time_;
	
	
	public Delay(float pos[], float time) {
		pos_ = pos.clone();
		time_ = time;
	}

	@Override
	public double totalTime() {
		return time_;
	}

	@Override
	public void getPosTime(double time, float[] xy) {
		xy[0] = pos_[0];
		xy[1] = pos_[1];
	}

    @Override
    public float[] getBounds() {
        return null;
    }
}
