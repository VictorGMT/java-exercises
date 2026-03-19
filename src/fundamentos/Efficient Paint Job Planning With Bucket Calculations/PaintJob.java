public class PaintJob {
    private static final int INVALID_VALUE = -1;

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)return INVALID_VALUE;
        double area = width * height;
        int bucketCount = getBucketCount(width, height, areaPerBucket);
        bucketCount = bucketCount - extraBuckets;
        return Math.max(bucketCount, 0);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0)return INVALID_VALUE;
        double area = width * height;

        return getBucketCount(area, areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket)
    {
        if(area <= 0|| areaPerBucket <= 0)return INVALID_VALUE;

        return (int) Math.ceil(area / areaPerBucket);
    }
}
