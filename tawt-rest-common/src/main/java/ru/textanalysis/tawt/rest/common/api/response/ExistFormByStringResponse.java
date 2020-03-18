package ru.textanalysis.tawt.rest.common.api.response;

import ru.textanalysis.common.rest.domain.response.BaseResponseAbstract;
import ru.textanalysis.tawt.rest.common.api.response.item.ExistForm;

public class ExistFormByStringResponse extends BaseResponseAbstract<ExistForm> {
    @Override
    public void createEmptyData() {
        data = new ExistForm();
    }
}
