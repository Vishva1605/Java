package Others.Threads;
class FileDownload{
    private int progress = 0;
    public synchronized void download(int resources){
        if(progress+resources>100)
            resources = 100 - progress;
        progress = progress + resources;   
        System.out.print(Thread.currentThread().getName()+" || Downloading Progress");
        String str = "[==========]";
        for(char ch : str.toCharArray()){
            System.out.print(ch);
            try{Thread.sleep(500);}catch(InterruptedException e){};
        }
        System.out.println(" : "+progress+"%");
    }
    public int getProgress() {
        return progress;
    }
}
class Resources extends Thread{
    private FileDownload download;
    private int resources;
    Resources(FileDownload download,String resourceName,int resources){
        super(resourceName);
        this.download = download;
        this.resources = resources;
    }
    public void run(){
        download.download(resources);
    }

}
public class downloadProgressUsingThread {
    public static void main(String[] args) {
        FileDownload f = new FileDownload();

        Resources r1 = new Resources(f,"Dress collection", 25);
        Resources r2 = new Resources(f,"Map   collection", 35);
        Resources r3 = new Resources(f,"Event collection", 20);
        Resources r4 = new Resources(f,"Other collection",30);

        r1.start();
        try{r1.join();}catch(InterruptedException e){};
        r2.start();
        try{r2.join();}catch(InterruptedException e){};
        r3.start();
        try{r3.join();}catch(InterruptedException e){};
        r4.start();
        try{r4.join();}catch(InterruptedException e){};
        System.out.println("Download Complete : "+f.getProgress()+"%");
    }
}
