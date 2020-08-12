class UndergroundSystem {
    private class UserData{
        int id;
        String checkInStation, checkOutStation;
        int checkInTime, checkOutTime;
        
        UserData(int id, String checkInStation, int checkInTime, String checkOutStation, int checkOutTime){
            this.id = id;
            this.checkInStation = checkInStation;
            this.checkOutStation = checkOutStation;
            this.checkInTime = checkInTime;
            this.checkOutTime = checkOutTime;
        }
        
    }
    
    
    List<UserData> data;
​
    public UndergroundSystem() {
        data = new ArrayList<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        UserData ud = new UserData(id, stationName, t, "", 0);
        data.add(ud);
    }
    
    public void checkOut(int id, String stationName, int t) {
        int index = 0;
        for(int i = 0; i < data.size(); i ++) {
            if(data.get(i).id == id)
                index = i;
        }
        data.get(index).checkOutStation = stationName;
        data.get(index).checkOutTime = t;
        
    }
    
