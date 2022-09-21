package com.carmesin.pos_sys.Pos.Service;

import com.carmesin.pos_sys.Pos.Model.priceModel;
import com.carmesin.pos_sys.Pos.Repository.pricesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class posService {

    @Autowired
    private pricesRepository pricesRepository;

    public List<priceModel> selectChoice (String choice){

        String input = "";

        if(choice.contains("Single")){
            input = "single";
        }else if(choice.contains("Group")){
            input = "group";
        }else{
            input = "birthday";
        }

        return pricesRepository.selectChoice(input);

    }

}
