public abstract class Vehicles implements Diagnosticable {
    @Override
    public void service() {
    }

    private final String modelName;
    private int wheelsCount;

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public Vehicles(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    static void updateTyre() {
        System.out.println("Проверяем колеса");
    }
}

