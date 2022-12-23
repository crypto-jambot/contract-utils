package dev.rabbit.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Int128;
import org.web3j.abi.datatypes.generated.Int56;
import org.web3j.abi.datatypes.generated.Uint128;
import org.web3j.abi.datatypes.generated.Uint160;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint32;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tuples.generated.Tuple8;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class TickTest extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50610b9a806100206000396000f3fe608060405234801561001057600080fd5b506004361061007d5760003560e01c806382c66f871161005b57806382c66f87146100e1578063b613524a14610101578063df33fa8814610114578063f30dba93146101345761007d565b806320b90da91461008257806330e3ff4c146100ab5780635cb083ce146100cc575b600080fd5b610095610090366004610898565b61015b565b6040516100a29190610ad1565b60405180910390f35b6100be6100b9366004610943565b61017f565b6040516100a2929190610b56565b6100df6100da366004610997565b61019e565b005b6100f46100ef366004610877565b61029a565b6040516100a29190610aea565b6100df61010f366004610877565b6102ad565b610127610122366004610a6c565b6102bb565b6040516100a29190610adc565b610147610142366004610877565b6102d7565b6040516100a2989796959493929190610afe565b6000610170818c8c8c8c8c8c8c8c8c8c610341565b9b9a5050505050505050505050565b6000806101908188888888886104fa565b915091509550959350505050565b600291820b820b600090815260208181526040918290208351815492850151600f0b6001600160801b03908116600160801b029181166001600160801b03199094169390931790921691909117815590820151600182015560608201519281019290925560808101516003909201805460a083015160c084015160e0909401511515600160f81b026001600160f81b0363ffffffff909516600160d81b0263ffffffff60d81b196001600160a01b03909316600160381b02600160381b600160d81b031960069890980b66ffffffffffffff1666ffffffffffffff19909516949094179690961692909217169390931791909116919091179055565b60006102a5826105a6565b90505b919050565b6102b8600082610610565b50565b60006102cc8188888888888861063c565b979650505050505050565b60006020819052908152604090208054600182015460028301546003909301546001600160801b03831693600160801b909304600f0b9290600681900b90600160381b81046001600160a01b031690600160d81b810463ffffffff1690600160f81b900460ff1688565b60028a810b900b600090815260208c90526040812080546001600160801b03168261036c828d6106f6565b9050846001600160801b0316816001600160801b031611156103ba576040805162461bcd60e51b81526020600482015260026024820152614c4f60f01b604482015290519081900360640190fd5b6001600160801b03828116159082161581141594501561045f578c60020b8e60020b1361044757600183018b9055600283018a9055600383018054600160381b600160d81b031916600160381b6001600160a01b038c16021766ffffffffffffff191666ffffffffffffff60068b900b161763ffffffff60d81b1916600160d81b63ffffffff8a16021790555b6003830180546001600160f81b0316600160f81b1790555b82546001600160801b0319166001600160801b038216178355856104a85782546104a39061049e90600160801b9004600f90810b810b908f900b6107b2565b6107c8565b6104c9565b82546104c99061049e90600160801b9004600f90810b810b908f900b6107d9565b8354600f9190910b6001600160801b03908116600160801b0291161790925550909c9b505050505050505050505050565b600285810b80820b60009081526020899052604080822088850b850b83529082209193849391929184918291908a900b1261054057505060018201546002830154610553565b8360010154880391508360020154870390505b6000808b60020b8b60020b121561057557505060018301546002840154610588565b84600101548a0391508460020154890390505b92909803979097039b96909503949094039850939650505050505050565b60008082600281900b620d89e719816105bb57fe5b05029050600083600281900b620d89e8816105d257fe5b0502905060008460020b83830360020b816105e957fe5b0560010190508062ffffff166001600160801b0380168161060657fe5b0495945050505050565b600290810b810b6000908152602092909252604082208281556001810183905590810182905560030155565b600295860b860b60009081526020979097526040909620600181018054909503909455938301805490920390915560038201805463ffffffff600160d81b6001600160a01b03600160381b808504821690960316909402600160381b600160d81b031990921691909117600681810b90960390950b66ffffffffffffff1666ffffffffffffff199095169490941782810485169095039093160263ffffffff60d81b1990931692909217905554600160801b9004600f0b90565b60008082600f0b121561075b57826001600160801b03168260000384039150816001600160801b031610610756576040805162461bcd60e51b81526020600482015260026024820152614c5360f01b604482015290519081900360640190fd5b6107ac565b826001600160801b03168284019150816001600160801b031610156107ac576040805162461bcd60e51b81526020600482015260026024820152614c4160f01b604482015290519081900360640190fd5b92915050565b818101828112156000831215146107ac57600080fd5b80600f81900b81146102a857600080fd5b808203828113156000831215146107ac57600080fd5b803580151581146102a857600080fd5b8035600f81900b81146102a857600080fd5b8035600281900b81146102a857600080fd5b8035600681900b81146102a857600080fd5b80356001600160801b03811681146102a857600080fd5b80356001600160a01b03811681146102a857600080fd5b803563ffffffff811681146102a857600080fd5b600060208284031215610888578081fd5b61089182610811565b9392505050565b6000806000806000806000806000806101408b8d0312156108b7578586fd5b6108c08b610811565b99506108ce60208c01610811565b98506108dc60408c016107ff565b975060608b0135965060808b013595506108f860a08c0161084c565b945061090660c08c01610823565b935061091460e08c01610863565b92506109236101008c016107ef565b91506109326101208c01610835565b90509295989b9194979a5092959850565b600080600080600060a0868803121561095a578081fd5b61096386610811565b945061097160208701610811565b935061097f60408701610811565b94979396509394606081013594506080013592915050565b6000808284036101208112156109ab578283fd5b6109b484610811565b925061010080601f19830112156109c9578283fd5b604051915080820182811067ffffffffffffffff821117156109e757fe5b6040526109f660208601610835565b8252610a04604086016107ff565b60208301526060850135604083015260808501356060830152610a2960a08601610823565b6080830152610a3a60c0860161084c565b60a0830152610a4b60e08601610863565b60c0830152610a5b8186016107ef565b60e083015250809150509250929050565b60008060008060008060c08789031215610a84578182fd5b610a8d87610811565b95506020870135945060408701359350610aa96060880161084c565b9250610ab760808801610823565b9150610ac560a08801610863565b90509295509295509295565b901515815260200190565b600f9190910b815260200190565b6001600160801b0391909116815260200190565b6001600160801b03989098168852600f9690960b60208801526040870194909452606086019290925260060b60808501526001600160a01b031660a084015263ffffffff1660c0830152151560e08201526101000190565b91825260208201526040019056fea2646970667358221220d4dc80ae1d9520844389019dbcde1d4fc440d4406d78495cd0c1759b04a6cacc64736f6c63430007060033";

    public static final String FUNC_CLEAR = "clear";

    public static final String FUNC_CROSS = "cross";

    public static final String FUNC_GETFEEGROWTHINSIDE = "getFeeGrowthInside";

    public static final String FUNC_SETTICK = "setTick";

    public static final String FUNC_TICKSPACINGTOMAXLIQUIDITYPERTICK = "tickSpacingToMaxLiquidityPerTick";

    public static final String FUNC_TICKS = "ticks";

    public static final String FUNC_UPDATE = "update";

    @Deprecated
    protected TickTest(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected TickTest(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected TickTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected TickTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> clear(BigInteger tick) {
        final Function function = new Function(
                FUNC_CLEAR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(tick)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> cross(BigInteger tick, BigInteger feeGrowthGlobal0X128, BigInteger feeGrowthGlobal1X128, BigInteger secondsPerLiquidityCumulativeX128, BigInteger tickCumulative, BigInteger time) {
        final Function function = new Function(
                FUNC_CROSS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(tick), 
                new org.web3j.abi.datatypes.generated.Uint256(feeGrowthGlobal0X128), 
                new org.web3j.abi.datatypes.generated.Uint256(feeGrowthGlobal1X128), 
                new org.web3j.abi.datatypes.generated.Uint160(secondsPerLiquidityCumulativeX128), 
                new org.web3j.abi.datatypes.generated.Int56(tickCumulative), 
                new org.web3j.abi.datatypes.generated.Uint32(time)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Tuple2<BigInteger, BigInteger>> getFeeGrowthInside(BigInteger tickLower, BigInteger tickUpper, BigInteger tickCurrent, BigInteger feeGrowthGlobal0X128, BigInteger feeGrowthGlobal1X128) {
        final Function function = new Function(FUNC_GETFEEGROWTHINSIDE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(tickLower), 
                new org.web3j.abi.datatypes.generated.Int24(tickUpper), 
                new org.web3j.abi.datatypes.generated.Int24(tickCurrent), 
                new org.web3j.abi.datatypes.generated.Uint256(feeGrowthGlobal0X128), 
                new org.web3j.abi.datatypes.generated.Uint256(feeGrowthGlobal1X128)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple2<BigInteger, BigInteger>>(function,
                new Callable<Tuple2<BigInteger, BigInteger>>() {
                    @Override
                    public Tuple2<BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> setTick(BigInteger tick, Info info) {
        final Function function = new Function(
                FUNC_SETTICK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(tick), 
                info), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> tickSpacingToMaxLiquidityPerTick(BigInteger tickSpacing) {
        final Function function = new Function(FUNC_TICKSPACINGTOMAXLIQUIDITYPERTICK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(tickSpacing)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint128>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple8<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, Boolean>> ticks(BigInteger param0) {
        final Function function = new Function(FUNC_TICKS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint128>() {}, new TypeReference<Int128>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Int56>() {}, new TypeReference<Uint160>() {}, new TypeReference<Uint32>() {}, new TypeReference<Bool>() {}));
        return new RemoteFunctionCall<Tuple8<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, Boolean>>(function,
                new Callable<Tuple8<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, Boolean>>() {
                    @Override
                    public Tuple8<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple8<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue(), 
                                (BigInteger) results.get(5).getValue(), 
                                (BigInteger) results.get(6).getValue(), 
                                (Boolean) results.get(7).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> update(BigInteger tick, BigInteger tickCurrent, BigInteger liquidityDelta, BigInteger feeGrowthGlobal0X128, BigInteger feeGrowthGlobal1X128, BigInteger secondsPerLiquidityCumulativeX128, BigInteger tickCumulative, BigInteger time, Boolean upper, BigInteger maxLiquidity) {
        final Function function = new Function(
                FUNC_UPDATE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(tick), 
                new org.web3j.abi.datatypes.generated.Int24(tickCurrent), 
                new org.web3j.abi.datatypes.generated.Int128(liquidityDelta), 
                new org.web3j.abi.datatypes.generated.Uint256(feeGrowthGlobal0X128), 
                new org.web3j.abi.datatypes.generated.Uint256(feeGrowthGlobal1X128), 
                new org.web3j.abi.datatypes.generated.Uint160(secondsPerLiquidityCumulativeX128), 
                new org.web3j.abi.datatypes.generated.Int56(tickCumulative), 
                new org.web3j.abi.datatypes.generated.Uint32(time), 
                new org.web3j.abi.datatypes.Bool(upper), 
                new org.web3j.abi.datatypes.generated.Uint128(maxLiquidity)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static TickTest load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new TickTest(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static TickTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new TickTest(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static TickTest load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new TickTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TickTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new TickTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<TickTest> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TickTest.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TickTest> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TickTest.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<TickTest> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TickTest.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TickTest> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TickTest.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static class Info extends StaticStruct {
        public BigInteger liquidityGross;

        public BigInteger liquidityNet;

        public BigInteger feeGrowthOutside0X128;

        public BigInteger feeGrowthOutside1X128;

        public BigInteger tickCumulativeOutside;

        public BigInteger secondsPerLiquidityOutsideX128;

        public BigInteger secondsOutside;

        public Boolean initialized;

        public Info(BigInteger liquidityGross, BigInteger liquidityNet, BigInteger feeGrowthOutside0X128, BigInteger feeGrowthOutside1X128, BigInteger tickCumulativeOutside, BigInteger secondsPerLiquidityOutsideX128, BigInteger secondsOutside, Boolean initialized) {
            super(new org.web3j.abi.datatypes.generated.Uint128(liquidityGross), 
                    new org.web3j.abi.datatypes.generated.Int128(liquidityNet), 
                    new org.web3j.abi.datatypes.generated.Uint256(feeGrowthOutside0X128), 
                    new org.web3j.abi.datatypes.generated.Uint256(feeGrowthOutside1X128), 
                    new org.web3j.abi.datatypes.generated.Int56(tickCumulativeOutside), 
                    new org.web3j.abi.datatypes.generated.Uint160(secondsPerLiquidityOutsideX128), 
                    new org.web3j.abi.datatypes.generated.Uint32(secondsOutside), 
                    new org.web3j.abi.datatypes.Bool(initialized));
            this.liquidityGross = liquidityGross;
            this.liquidityNet = liquidityNet;
            this.feeGrowthOutside0X128 = feeGrowthOutside0X128;
            this.feeGrowthOutside1X128 = feeGrowthOutside1X128;
            this.tickCumulativeOutside = tickCumulativeOutside;
            this.secondsPerLiquidityOutsideX128 = secondsPerLiquidityOutsideX128;
            this.secondsOutside = secondsOutside;
            this.initialized = initialized;
        }

        public Info(Uint128 liquidityGross, Int128 liquidityNet, Uint256 feeGrowthOutside0X128, Uint256 feeGrowthOutside1X128, Int56 tickCumulativeOutside, Uint160 secondsPerLiquidityOutsideX128, Uint32 secondsOutside, Bool initialized) {
            super(liquidityGross, liquidityNet, feeGrowthOutside0X128, feeGrowthOutside1X128, tickCumulativeOutside, secondsPerLiquidityOutsideX128, secondsOutside, initialized);
            this.liquidityGross = liquidityGross.getValue();
            this.liquidityNet = liquidityNet.getValue();
            this.feeGrowthOutside0X128 = feeGrowthOutside0X128.getValue();
            this.feeGrowthOutside1X128 = feeGrowthOutside1X128.getValue();
            this.tickCumulativeOutside = tickCumulativeOutside.getValue();
            this.secondsPerLiquidityOutsideX128 = secondsPerLiquidityOutsideX128.getValue();
            this.secondsOutside = secondsOutside.getValue();
            this.initialized = initialized.getValue();
        }
    }
}
