package wall;

import wallObject.WallObject;

public class Wall {
    private WallObject wallObject;

    public WallObject getWallObject() {
        return wallObject;
    }
    public void setWallObject(WallObject wallObj) {
        this.wallObject = wallObj;
    }
    public String look() {
        if (wallObject != null) return wallObject.look();
        else return "Wall";
    }


}
