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
s
'use strict';

const { Contract } = require('fabric-contract-api');

class CostFunctionContract extends Contract {

    async storeCostFunction(ctx, costFunction) {
        await ctx.stub.putState('costFunction', Buffer.from(costFunction));
    }

    async getCostFunction(ctx) {
        const costFunction = await ctx.stub.getState('costFunction');
        return costFunction.toString();
    }
}

module.exports = CostFunctionContract;