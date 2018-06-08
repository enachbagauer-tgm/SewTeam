package com.gmail.semih.ui.utils.converters;

import com.vaadin.flow.templatemodel.ModelEncoder;
import com.gmail.semih.ui.dataproviders.DataProviderUtil;
import com.gmail.semih.ui.utils.FormattingUtils;

public class CurrencyFormatter implements ModelEncoder<Integer, String> {

	@Override
	public String encode(Integer modelValue) {
		return DataProviderUtil.convertIfNotNull(modelValue, FormattingUtils::formatAsCurrency);
	}

	@Override
	public Integer decode(String presentationValue) {
		throw new UnsupportedOperationException();
	}
}
