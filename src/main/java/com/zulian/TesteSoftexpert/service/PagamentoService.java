package com.zulian.TesteSoftexpert.service;

import com.zulian.TesteSoftexpert.model.entity.FormaPagamento;
import com.zulian.TesteSoftexpert.service.MercadoPago.MercadoPagoService;
import com.zulian.TesteSoftexpert.service.PicPay.PicPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    @Autowired
    private PicPayService picPay;
    @Autowired
    private MercadoPagoService mercadoPago;
    public void enviarPagamento(FormaPagamento forma, Double valor ){
        if (forma.equals(FormaPagamento.PicPay)){
            picPay.cobranca(valor);
        }else{
            mercadoPago.cobranca(valor);
        }

    }
}
