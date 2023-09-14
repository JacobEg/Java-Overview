package interface_overview;

public interface Automobile {

    public final int MAX_GEAR = 6;
    public final int REVERSE_GEAR = -1;
    public final int PARK_GEAR = 0;

    public void shiftGear(int gear);

    public String honk();

    public void setVelocity(int velocity);

    public boolean isSpeeding(int speedLimit);
}
