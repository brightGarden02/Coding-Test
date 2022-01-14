class Solution {
public:
    int numberOfBeams(vector<string>& bank) {
        
        int shotBeam = 0, gotBeam = 0, tmpShotBeam = 0, noBeam = 0;
        for(int i = 0; i < bank.size(); i++){
            string tmp = bank[i];
            
            if(shotBeam == 0){
                for(int j = 0; j < tmp.size(); j++){
                    if(tmp[j] == '1'){
                        shotBeam++;
                    }
                }
            }
            else{
                tmpShotBeam = shotBeam;
                shotBeam = 0;
                noBeam = 0;
                for(int j = 0; j < tmp.size(); j++){
                    if(tmp[j] == '1'){
                        gotBeam = gotBeam + tmpShotBeam;
                        shotBeam++;
                    }
                    else{
                        noBeam++;
                    }
                }
                if(noBeam == tmp.size()){
                    shotBeam = tmpShotBeam;
                }
            }
        }
        
        return gotBeam;
    }
};