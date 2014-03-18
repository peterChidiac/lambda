/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lambdatest;


/**
 *
 * @author peter
 */
public class LambdaTest {
    
    enum SoccerResult{
        WON, LOST, DRAW
    }

    interface SoccerService {
        SoccerResult getSoccerResult(Integer teamA, Integer teamB);
    }

    public void soccerResultPredictor() {

        SoccerService soccerService = (teamA, teamB) -> {
            SoccerResult result = null;
            if (teamA == teamB){
                result = SoccerResult.DRAW;
            }else if(teamA < teamB){
                result = SoccerResult.LOST;
            }else{
                result = SoccerResult.WON;
            }
            return result;
        };

        // man utd vs wolves
        SoccerResult soccerResult = soccerService.getSoccerResult(3,1);
        System.out.println("soccerResult = " + soccerResult);

    }

    public static void main(String... args) {
        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.soccerResultPredictor();

    }


}
