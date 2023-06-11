public class phonePlan{

    private String phoneProvider;
    private String phoneModel;
    private int monthMinute;
    private int monthData;
    private int monthMinuteUse;
    private int monthDataUse;

        public phonePlan(){}

        public phonePlan(String phoneProvider, String phoneModel, int monthMinute, int monthMinuteUse, int monthData, int monthDataUse){
            this.phoneProvider = phoneProvider;
            this.phoneModel = phoneModel;
            this.monthMinute = monthMinute;
            this.monthMinuteUse = monthMinuteUse;
            this.monthData = monthData;
            this.monthDataUse = monthDataUse;

            String[] phoneProviders = new String[]{"AT&T", "T-Mobile", "Sprint", "Google Fi", "Verizon", "Mint", "Boost"};
            String[] phoneModels = new String[]{"Samsung Galaxy", "Google Pixel", "Apple iPhone"};
            int[] monthMinutes = new int[]{500, 1000, 2500, 5000, 10000, 43800};
            int[] monthDatas = new int[]{10, 15, 20, 25, 30, 35, 40, 45, 50};

        }

        public void setPhoneProvider(String phoneProvider){

            if(phoneProvider.equals(phoneProviders.phonePlan));
                this.phoneProvider = phoneProvider;
            }   else {
            this.phoneProvider = phoneProviders[3];
            }

        public String getPhoneProvider(){
            return phoneProvider;
        }

        public void setPhoneModel(String phoneModel){
            if(phoneModel.equals(phoneModels.phonePlan));
                this.phoneModel = phoneModel;
            } else {
            this.phoneModel = phoneModels[2];
            }
        public String getPhoneModel(){
            return phoneModel;
            }
        
        public void setMonthMinute(int monthMinute){
            if(monthMinute.equals(monthMinutes.phonePlan));
                this.monthMinute = monthMinute;
            } else {
            this.monthMinute = monthMinutes[5];
            }

        public int getMonthMinute(){
            return monthMinute;
            }

        public void setMonthData(int monthData){
            if(monthData.equals(monthMinutes.phonePlan));
                this.monthData = monthData;
            } else {
            this.monthData = monthDatas[8];
            }

        public getMonthData(){
            return monthData;
            }
}

