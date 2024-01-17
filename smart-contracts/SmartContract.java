/*
 * GPT-Generated Source Code
 * This file is automatically generated by the GPT language model.
 * It may contain human-reviewed content, but its primary source is automated.
 * Any changes made manually may be overwritten.
 * For more information, refer to the GPT-3.5 documentation.
 * 
 * GDPR Compliance:
 * This code may include data generated by GPT-3.5, a language model developed by OpenAI.
 * Please ensure compliance with applicable data protection regulations, such as GDPR, when using this code.
 */

import org.hyperledger.fabric.contract.Context;
import org.hyperledger.fabric.contract.ContractInterface;
import org.hyperledger.fabric.contract.annotation.Contract;
import org.hyperledger.fabric.contract.annotation.Default;
import org.hyperledger.fabric.contract.annotation.Transaction;
import org.hyperledger.fabric.shim.ChaincodeException;
import org.hyperledger.fabric.shim.ChaincodeStub;

@Contract(
        name = "CostFunctionContract",
        info = @Default
)
public class CostFunctionContract implements ContractInterface {

    @Transaction
    public void storeCostFunction(Context ctx, String costFunction) {
        ChaincodeStub stub = ctx.getStub();
        stub.putStringState("costFunction", costFunction);
    }

    @Transaction
    public String getCostFunction(Context ctx) {
        ChaincodeStub stub = ctx.getStub();
        return stub.getStringState("costFunction");
    }

    public static void main(String[] args) {
        new CostFunctionContract().start(args);
    }
}