//package org.firstinspires.ftc.teamcode.drive.opmode.imagedetect;
//import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
//import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
//import org.firstinspires.ftc.teamcode.drive.opmode.bot.PowerPlayBot;
//import org.openftc.easyopencv.OpenCvCamera;
//import org.openftc.easyopencv.OpenCvCameraFactory;
//import org.openftc.easyopencv.OpenCvCameraRotation;
//
//import com.acmerobotics.dashboard.config.Config;
//import com.acmerobotics.roadrunner.geometry.Pose2d;
//import com.acmerobotics.roadrunner.geometry.Vector2d;
//import com.acmerobotics.roadrunner.trajectory.Trajectory;
//import com.acmerobotics.roadrunner.trajectory.TrajectoryBuilder;
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//@Config
//@Autonomous(name = "Signal Sleeve Test")
//public class CameraSetUp extends LinearOpMode {
//    SleeveColorDetection sleeveDetection;
//    OpenCvCamera camera;
//
//    // Name of the Webcam to be set in the config
//    String webcamName = "Webcam 1";
//
//    public int POSITION = 1;
//    public static double POWER = 0.001;
//
//    private PowerPlayBot robot = null;
//    private ElapsedTime timer;
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//        int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());
//        camera = OpenCvCameraFactory.getInstance().createWebcam(hardwareMap.get(WebcamName.class, webcamName), cameraMonitorViewId);
//        sleeveDetection = new SleeveColorDetection();
//        camera.setPipeline(sleeveDetection);
//
//        camera.openCameraDeviceAsync(new OpenCvCamera.AsyncCameraOpenListener()
//        {
//            @Override
//            public void onOpened()
//            {
//                camera.startStreaming(320,240, OpenCvCameraRotation.UPRIGHT);
//            }
//
//            @Override
//            public void onError(int errorCode) {}
//        });
//
//        robot = new PowerPlayBot();
//        timer = new ElapsedTime();
//
//        while (!isStarted()) {
//            telemetry.addData("ROTATION: ", sleeveDetection.getParkPosition());
//            telemetry.update();
//
//            POSITION = sleeveDetection.getParkPosition();
//        }
//
//
//        robot.init(this, hardwareMap, telemetry);
//
//        waitForStart();
//
//        while(!isStopRequested()) {
//            telemetry.addData("position: ", POSITION);
//            telemetry.update();
//
//            break;
//        }
//    }
//}
