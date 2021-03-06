package com.benmohammad.mobiusapplication.addedittask.domain;

import com.spotify.dataenum.DataEnum;
import com.spotify.dataenum.dataenum_case;

@DataEnum
interface AddEditTaskEvent_dataenum {

    dataenum_case TaskDefinitionCompleted(String title, String description);

    dataenum_case TaskCreatedSuccessfully();

    dataenum_case TaskCreationFailed(String reason);

    dataenum_case TaskUpdatedSuccessfully();

    dataenum_case TaskUpdateFailed(String reason);

}
